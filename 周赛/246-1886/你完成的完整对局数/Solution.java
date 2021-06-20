class Solution {
    public int numberOfRounds(String startTime, String finishTime) {
        int startH=Integer.parseInt(startTime.substring(0,2));
        int startM=Integer.parseInt(startTime.substring(3,5));
        int endH=Integer.parseInt(finishTime.substring(0,2));
        int endM=Integer.parseInt(finishTime.substring(3,5));
        int times=0;
        if(startM>0&&startM<=15) startM=15;
        else if(startM>15&&startM<=30) startM=30;
        else if(startM>30&&startM<=45) startM=45;
        else {
            if(startM!=0) startH=(startH+1)%24;
            startM=0;
        }
        if(endM>=0&&endM<15) endM=0;
        else if(endM>=15&&endM<30) endM=15;
        else if(endM>=30&&endM<45) endM=30;
        else endM=45;
        while(startH!=endH||endM!=startM){
            startM+=15;
            times++;
            if(startM==60){
                startH=(startH+1)%24;
                startM=0;
            }
        }
        return times;
    }
}