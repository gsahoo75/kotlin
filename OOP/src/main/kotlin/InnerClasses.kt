// the classes which are declared inside another classes
class ListView(val items: Array<String>){
    inner class ListViewItem(){
        fun displayItem(position: Int){
            println(items[position])
        }
    }
}

fun main(args: Array<String>)
{
    val listView = ListView(arrayOf("suman","Gobinda","suman2"));
    listView.ListViewItem().displayItem(1);
}