/*
执行用时：14 ms, 在所有 Java 提交中击败了83.51%的用户
内存消耗：37.6 MB, 在所有 Java 提交中击败了86.32%的用户
*/
class Foo {
    boolean a=false,b=false;
    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        a=true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(a==false);
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        b=true;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(b==false);
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}