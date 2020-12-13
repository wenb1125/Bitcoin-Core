package com.btc.rpc.demo;

public class Enum_demo {
    public static void main(String[] args) {
        printWeekDay(Week.THURSDAY_FOUR);
        String day = printWeek(Week.THURSDAY_FOUR);
        System.out.println(day);
    }

    /**
     * 需求,接受传入的参数,星期x,进行打印一句话:xxx是一个星期的第几天
     * 星期一 -> 这是一个星期的第一天
     */
    public static void printWeekDay(Week week){
        switch (week){
            case MONDAY_ONE:
                System.out.println("这是一个星期的第一天.");
                break;
            case TUESDAY_TOW:
                System.out.println("这是一个星期的第二天.");
                break;
            case WEDNESDAY_THREE:
                System.out.println("这是一个星期的第三天.");
                break;
            case THURSDAY_FOUR:
                System.out.println("这是一个星期的第四天.");
                break;
            case FRIDAY_FIVE:
                System.out.println("这是一个星期的第五天.");
                break;
            case SATURDAY_SIX:
                System.out.println("这是一个星期的第六天.");
                break;
            case SUNDAY_SEVEN:
                System.out.println("这是一个星期的第七天.");
                break;
        }
    }

    public static String printWeek(Week week){
        switch (week){
            case MONDAY_ONE:
                return "这是一个星期的第一天.";
            case TUESDAY_TOW:
                return "这是一个星期的第二天.";
            case WEDNESDAY_THREE:
                return "这是一个星期的第三天.";
            case THURSDAY_FOUR:
                return "这是一个星期的第四天.";
            case FRIDAY_FIVE:
                return "这是一个星期的第五天.";
            case SATURDAY_SIX:
                return "这是一个星期的第六天.";
            case SUNDAY_SEVEN:
                return "这是一个星期的第七天.";
            default:return null;
        }
    }

}
