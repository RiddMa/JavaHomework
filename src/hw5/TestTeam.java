package hw5;

public class TestTeam {
    public static void main(String[] args) {
        Team t = new Team();
        t.addMember(new Magicer(2, "魔法师1"));
        t.addMember(new Soldier(1, "士兵1"));
        t.addMember(new Soldier(2, "士兵2"));
        t.addMember(new Soldier(3, "士兵3"));
        t.addMember(new Soldier(4, "士兵4"));
        t.addMember(new Soldier(5, "士兵5"));
        t.addMember(new Soldier(30, "士兵6"));
        System.out.println("队伍中成员为：");
        for (int i = 0; i < t.getTeam().length; i++) {
            System.out.println("成员" + (i + 1) + ":" + t.getTeam()[i].getName() + " 伤害值为：" + t.getTeam()[i].attack());
        }
        System.out.println("队伍对敌人造成总伤害值为" + t.attackSum());
    }
}
