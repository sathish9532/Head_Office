class Branch extends Branch_Plan
{
public static void main(String[] args)
{
Branch branch = new Branch();
branch.check_account(1000);
branch.pay_tax(2000);
branch.do_interview();
branch.receive_customers();
}
public void check_account(){
//return amount;
}
public int pay_tax(){
return 2000;
}
public void do_interview(){
}
}
