public class FootBall extends AbstractGame{

    @Override
    public void endPlay() {
        System.out.println("football结束");
    }

    @Override
    public void startPlay() {
        System.out.println("football开始");
    }

    @Override
    public void playing() {
        System.out.println("football正在进行中");
    }

}