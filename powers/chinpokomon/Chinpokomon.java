package powers.chinpokomon;
public interface Chinpokomon {
    public String getName();
    public void setName(String newName);
    public double getDamage();
    public void setDamage(double damage);
    public double getDefense();
    public void setDefense(double defensePercentage);
    public String getTechnicalDetail();
    public void setTechnicalDetail(String description);
    public String getCinematic();
    public void setCinematic(String narration);
    public String attackNarration();
    public String defenseNarration();
}