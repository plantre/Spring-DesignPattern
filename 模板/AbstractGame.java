public abstract class AbstractGame{
    public abstract void  endPlay();
    public abstract void startPlay();
    public abstract void playing();

    //这个就是模板，后面的就是按照这个模板进行执行
    public void haveFun(){
        startPlay();

        playing();

        endPlay();
    }
}