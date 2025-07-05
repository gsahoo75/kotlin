import kotlin.system.exitProcess

class Account(val accountName: String){
    var balance=0
    var transactions = mutableListOf<Int>()

    fun deposit(amount: Int){
        if(amount>0){
            this.balance+=amount;
            this.transactions.add(amount);
            println("$amount deposited successfully!!\nyour updated amount is $balance");
        }else{
            println("enter +ve amount");
        }
    }
    fun withdraw(amount: Int){
        if(amount>balance){
            println("you have $balance")
        }else{
            this.transactions.add((-1 * amount));
            this.balance-=amount;
            println("$amount withdrew successfully, your updated amount is $balance")
        }
    }
}

fun main(args: Array<String>)
{
    var choice=-1;
    var accounts  = mutableListOf<Account>();
    while(true){
        println("enter your choice")
        println("1. deposit")
        println("2. withdraw")
        println("3. createAccount")
        println("4. showTransaction")
        println("5. exit")
        choice = readln().toInt();
        when(choice){
            1 -> deposit(accounts)
            2 -> withdraw(accounts)
            3 -> createAccount(accounts)
            4-> showTransaction(accounts)
            5 -> exitProcess(0)
            else -> println("enter a valid choice")
        }
    }
}
fun showAccounts(accounts: MutableList<Account>) {
    for(i in 0 until accounts.size){
        println("${i+1}. ${accounts[i].accountName}")
    }
}
fun showTransaction(accounts: MutableList<Account>) {
    if(accounts.size==0){
        println("there are no accounts")
        return;
    }
    showAccounts(accounts)
    println("Enter your choice")
    val choice = readln().toInt();
    if(choice>accounts.size){
        println("enter a valid choice");
        return;
    }
    for(tn in accounts[choice-1].transactions)println(tn);
    println("current balance is ${accounts[choice-1].balance}")
}

fun deposit(accounts: MutableList<Account>) {
    if(accounts.size==0){
        println("there are no accounts")
        return;
    }
    showAccounts(accounts)
    println("Enter your choice")
    val choice = readln().toInt();
    if(choice>accounts.size){
        println("enter a valid choice");
        return;
    }
    println("enter the amount")
    val amt = readln().toInt();
    accounts[choice-1].deposit(amt);

}

fun withdraw(accounts: MutableList<Account>) {
    if(accounts.size==0){
        println("there are no accounts")
        return;
    }
    showAccounts(accounts)
    println("Enter your choice")
    val choice = readln().toInt();
    if(choice>accounts.size){
        println("enter a valid choice");
        return;
    }
    println("enter the amount")
    var amt = readln().toInt();
    accounts[choice-1].withdraw(amt);
}

fun createAccount(accounts: MutableList<Account>) {
    println("Enter your name")
    var name = readlnOrNull();
    if(name!=null){
        accounts.add(Account(name));
        println("account created successfully")
    }else{
        println("unable to create account, Enter a valid name");
    }
}
