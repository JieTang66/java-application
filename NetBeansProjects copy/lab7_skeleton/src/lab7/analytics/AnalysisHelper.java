/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    // TODO
    
    public void userWithMostLikes(){
        Map<Integer,User> userHashMap = DataStore.getInstance().getUsers();
        
        Map<Integer, Integer> tempUserHashMap = new HashMap<Integer, Integer>();
        
        for(User u:userHashMap.values()){
            
            for(Comment c:u.getComments()){
                int likes = 0;
                if(tempUserHashMap.containsKey(u.getId())){
                    likes = tempUserHashMap.get(u.getId());
                }
                likes += c.getLikes();
                
                tempUserHashMap.put(u.getId(), likes);
            }
        }
        
        int max=0;
        int maxId=0;
        for(int id:tempUserHashMap.keySet()){
            if(tempUserHashMap.get(id)>max){
                max=tempUserHashMap.get(id);
                maxId = id;
            }
        }
        
        System.out.println("User With Most Likes:\t" + max + "\t Entire User Object\t" + userHashMap.get(maxId));
    }
    
    // find 5 comments which have the most likes
    // TODO
    public void topFiveComments(){
        Map<Integer, Comment> commentHashMap = DataStore.getInstance().getComments();
        
        List<Comment> commentList = new ArrayList<Comment>(commentHashMap.values());
        
        Collections.sort(commentList, new Comparator<Comment>(){
            @Override
            public int compare(Comment o1, Comment o2){
                return o2.getLikes() - o1.getLikes();
            }
        });
        
        System.out.println("Printing the top five comments");
        
        for(int j=0; j<commentList.size()&&j<5;j++){
            System.out.println(commentList.get(j));
        }
    }
    
    //Find Average number of likes per comment.
    public void aveNumOfLikePerComment(){
        Map<Integer, Comment> commentHashMap = DataStore.getInstance().getComments();
        int account = 0;
        int like=0;
        List<Comment> commentList = new ArrayList<Comment>(commentHashMap.values());
        for(Comment c: commentList){
            account++;
            like+=c.getLikes();
        }
        
        System.out.println("Printing the Average number of likes per comment");
        System.out.println(like/account);
    }
    
    //Find the post with most liked comments.
    public void mostLikedPost(){
        Map<Integer, Post> postHashMap = DataStore.getInstance().getPosts();
        
        Map<Integer, Integer> tempPostHashMap = new HashMap<Integer, Integer>();
        
        for(Post p:postHashMap.values()){
            for(Comment c:p.getComments()){
                int likes = 0;
                if(tempPostHashMap.containsKey(p.getPostId())){
                    likes = tempPostHashMap.get(p.getPostId());
                }
                likes += c.getLikes();
                
                tempPostHashMap.put(p.getPostId(), likes);
            }
        }
        
        int max=0;
        //int maxId=0;
        Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();
        for(int id:tempPostHashMap.keySet()){
            if(tempPostHashMap.get(id)>=max){
                max=tempPostHashMap.get(id);
                tmp.put(id, max);
            }
        }
        
        List<Integer> keyList = new ArrayList<>();
        for(int getKey: tmp.keySet()){
            if(tmp.get(getKey).equals(max)){
                keyList.add(getKey);
            }
        }
        
        for(int j=0;j<keyList.size();j++){
           System.out.println("Post With Most Likes:\t" + max + "\t Entire Post Object\t" + postHashMap.get(keyList.get(j)));  
        }
       // System.out.println("Post With Most Likes:\t" + max + "\t Entire Post Object\t" + postHashMap.get(maxId));
    }
    
    //Find the post with most comments.
    public void mostCommentsPost(){
        Map<Integer, Post> postHashMap = DataStore.getInstance().getPosts();
        List<Post> postList = new ArrayList<Post>();
        
        Map<Integer, Integer> tempPostHashMap = new HashMap<Integer, Integer>();
        
        for(Post p:postHashMap.values()){
            int count = 0;
            for(Comment c:p.getComments()){
                count ++;             
            }
            tempPostHashMap.put(p.getPostId(), count);
        }
        
        int max=0;
        Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();
       // int[] maxId={};
        for(int id:tempPostHashMap.keySet()){
            if(tempPostHashMap.get(id)>=max){
                max=tempPostHashMap.get(id);
                tmp.put(id, max);
            }
            
        }
        //以防多个postid有相同的最大值
        List<Integer> keyList = new ArrayList<>();
        for(int getKey: tmp.keySet()){
            if(tmp.get(getKey).equals(max)){
                keyList.add(getKey);
            }
        }
        
        for(int j=0;j<keyList.size();j++){
           System.out.println("Post With Most comments:\t" + max + "\t Entire Post Object\t" + postHashMap.get(keyList.get(j)));  
        }
           
    }
    //Top 5 inactive users based on total posts number.
    public void topFiveInactiveUsersOfPosts(){
        Map<Integer, User> userHashMap = DataStore.getInstance().getUsers();
        Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();
        Map<Integer, Post> postHashMap = DataStore.getInstance().getPosts();
        List<Post> postList = new ArrayList<Post>();
        
        for(User u:userHashMap.values()){
            int account = 0;
            for(Post p:postHashMap.values()){  
                if(u.getId()==(p.getUserId())){
                    account++;
                    tmp.put(u.getId(), account);
                }
            
            }
            
        }
        
        
        List<Map.Entry<Integer,Integer>> list_Data = new ArrayList<Map.Entry<Integer,Integer>>(tmp.entrySet());
        Collections.sort(list_Data, new Comparator<Map.Entry<Integer,Integer>>()
        {
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2)
            {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        
        
        System.out.println(list_Data);
        
        //Collections.sort(keyList);
        System.out.println("Printing the top 5 inactive users based on total posts number");
        
        for(int j=0; j<list_Data.size()&&j<5;j++){
            System.out.println(userHashMap.get(list_Data.get(j).getKey()));
        }
        
        
    }
    
    
}
