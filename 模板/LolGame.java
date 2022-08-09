public class LolGame extends AbstractGame {

    @Override
    public void endPlay() {
        System.out.println("LOL结束");
    }

    @Override
    public void startPlay() {
        System.out.println("LOLl开始");
    }

    @Override
    public void playing() {
        System.out.println("LOL正在进行中");
    }

}