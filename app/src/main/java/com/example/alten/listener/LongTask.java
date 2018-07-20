package com.example.alten.listener;

public class LongTask {

    private OnTaskListener onTaskListener;

    public void setOnTaskListener(OnTaskListener onTaskListener){
        this.onTaskListener = onTaskListener;
    }

    public void runTask(){
        try{
            Thread.sleep(3000);
            onTaskListener.onComplete();
        }catch (InterruptedException e){

        }
    }

}
