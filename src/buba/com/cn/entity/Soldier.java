package buba.com.cn.entity;

/**
 * @program: firstJavaWeb
 * @ClassName Soldier
 * @description:
 * @author: MSY
 * @create: 2022-09-20 15:45
 * @Version 1.0
 **/
public class Soldier {

    private Integer soldierId;
    private String soldierName;
    private String soldierWeapon;

    public Soldier() {
    }

    public Soldier(String soldierName, String soldierWeapon) {
        this.soldierName = soldierName;
        this.soldierWeapon = soldierWeapon;
    }

    public Soldier(Integer soldierId, String soldierName, String soldierWeapon) {
        this.soldierId = soldierId;
        this.soldierName = soldierName;
        this.soldierWeapon = soldierWeapon;
    }
    public Integer getSoldierId() {
        return soldierId;
    }

    public void setSoldierId(Integer soldierId) {
        this.soldierId = soldierId;
    }

    public String getSoldierName() {
        return soldierName;
    }

    public void setSoldierName(String soldierName) {
        this.soldierName = soldierName;
    }

    public String getSoldierWeapon() {
        return soldierWeapon;
    }

    public void setSoldierWeapon(String soldierWeapon) {
        this.soldierWeapon = soldierWeapon;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "soldierId=" + soldierId +
                ", soldierName='" + soldierName + '\'' +
                ", soldierWeapon='" + soldierWeapon + '\'' +
                '}';
    }
}
