package com.jkun.design.代理模式.强制代理;

/**
 * @Author: jkun
 * @Description:
 * @Date: Create in 14:56 2022/4/1 
 */
public class Client {

//    public static void main(String[] args) {
//
//        Student student = new Student();
//        student.setName("小明");
//        student.doHomeWork();
//        System.out.println("----------------");
//
//        StudentProxy studentProxy = new StudentProxy(student);
//        studentProxy.doHomeWork();
//
//        System.out.println("----------------");
//
//        StudentHomeWork studentProxy1 = student.getStudentProxy();
//        studentProxy1.doHomeWork();
//    }


    static int find(int[]src,int key)
    {
        int low=0;
        int high=src.length-1;
        while (low<=high)
        {
            int mid=(low+high)/2;
            if(key>src[mid])
            {
                low=mid+1;
            }
            else if(key<src[mid])
            {
                high=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]a=new int[] {12,23,31,45,78,90};
        System.out.println(find(a,90));
    }

}
