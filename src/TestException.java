public class TestException {

    public static void main(String[] args) {
/*        File f= new File("d:/LOL.txt");
        try{
            System.out.println("试图打开 d:/LOL.txt");
            new FileInputStream(f);
            System.out.println("成功打开");
        }
        catch(Exception e){
            System.out.println("d:/LOL.txt不存在");
            e.printStackTrace();
        }
        finally {
            System.out.println("无论是否有异常，都会执行finally中的代码");
        }*/

        Hero garen =  new Hero();
        garen.name = "盖伦";
        garen.hp = 616;

        Hero teemo =  new Hero();
        teemo.name = "提莫";
        teemo.hp = 0;

        try {
            garen.attackHero(teemo);

        } catch (EnemyHeroIsDeadException e) {
            System.out.println("异常的具体原因:"+e.getMessage());
            e.printStackTrace();
        }

    }
}
