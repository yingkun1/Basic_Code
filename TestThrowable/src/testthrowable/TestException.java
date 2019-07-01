package testthrowable;

public class TestException {
    public static void main(String[] args) {
        try {
            TestException.MyExpection();
        } catch (MyException e) {
//            System.out.println("捕获了一个异常");
            e.printStackTrace();
        }
//        try {
//            System.out.println("try开始");
//            String str = "abc";
//            str.length();
//            str.charAt(10);
//            System.out.println("try结束");
//        } catch (NullPointerException e){
//            System.out.println("捕获到了NullPointer异常");
//        }catch (StringIndexOutOfBoundsException e){
//            System.out.println("捕获到了字符串越界的异常");
//        }finally {
//            System.out.println("我是finall,我必须执行!");
//        }
//        String s = null;
//        try {
//            s = testException();
//        } catch (NullPointerException e) {
//            System.out.println("捕获了异常");
//        }catch (StringIndexOutOfBoundsException e){
//            System.out.println("捕获了String相关的异常");
//        } catch (Exception e) {
//            System.out.println("捕获了最终的异常");
//        }
//        System.out.println(s);
    }

    private static String testException() throws Exception,NullPointerException,StringIndexOutOfBoundsException{
        String str = "abc";
        str.length();
        str.charAt(19);
//        try {
//            System.out.println("try开始");
////            String str = null;
////            str.length();
//            System.out.println("try结束");
//            return "try提前返回";
//        } catch (Exception e) {
////            e.printStackTrace();        //打印出捕获到的异常的名字
//            System.out.println("捕获到了异常");
//        }finally {
//            System.out.println("finally块执行了");
//        }
        return "最终的返回值";
    }

    public static void MyExpection() throws MyException{
        System.out.println("这个方法用来测试自定义的异常!");
        if (3>2){
            throw new MyException("说明下这个异常的作用");
        }
    }
}
