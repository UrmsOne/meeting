package com.meeting.app;

import com.meeting.command.UserCommand;
import com.meeting.pojo.User;

import java.util.Scanner;

/**
 * User: FlowingFire
 * Date: 2017/9/21 0021
 * Time: 22:28
 * Description:
 */
public class AppMain {
    public static void main(String[] args) {
        UserCommand userCommand=new UserCommand();
        User user=null;
        Scanner scanner = new Scanner(System.in);

        while(true){
            String s = scanner.nextLine();
            if("end".equals(s)){
                break;
            }else{
                if(s!=null){
                    String[] arg = s.split(" ");
                    switch (arg[0]){
                        case "login":
                           user=userCommand.loginOptions(arg);
                           System.out.println(user);
                           break;
                        case "register":
                            userCommand.registerOptions(arg);
                            break;
                    }
                }






            }
        }
    }
}