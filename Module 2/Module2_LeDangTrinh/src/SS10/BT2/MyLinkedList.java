package SS10.BT2;


public class MyLinkedList<E> {
    public class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }
    private Node head;
    private int numNodes;

    public MyLinkedList(){}

    public void add(int index,E element){
        //Khai báo một node temp để chứa node đầu tiên
        Node temp = head;
        //Khai báo node holder
        Node holder;

        //Cho con trỏ chạy đến vị trí index - 1
        for(int i=0; i < index-1 && temp.next != null; i++){
            temp = temp.next;
        }

        //holder tham chiếu đến Node tại vị trí index
        holder = temp.next;
        //Node tại vị trí index -1 trỏ tới node mới
        temp.next = new Node(element);
        //Node mới trỏ tới holder
        temp.next.next = holder;
        //Tăng số lượng phần tử lên +1
        numNodes++;
    }

    public void addFirst(E e){
        //Khai báo một biến temp tham chiếu đến giá trị của head
        Node temp = head;
        //head nhận giá trị của Node mới
        head = new Node(e);
        //head trỏ tới biến temp là head cũ
        head.next = temp;
        //tăng số lượng phần tử của danh sách lên +1
        numNodes++;
    }

    public void addLast(E e){
        //Khai báo Node trỏ đến node head
        Node temp = head;
        //Cho con trỏ chạy đến cuối cùng (phần tử cuối cùng sẽ có next == null
        while (temp.next != null){
            temp = temp.next;
        }
        //Phần tử cuối cùng sẽ trỏ đến node mới
        temp.next = new Node(e);
        //tăng số lượng phần tử của danh sách lên +1
        numNodes++;
    }

    public E remove(int index){
        //Kiểm tra điều kiện index, throw exception nếu index lớn hơn số lượng node hoặc nhỏ hơn 0
        if(index<0 || index>numNodes){
            throw new IndexOutOfBoundsException();
        }
        //Khai báo 1 node trỏ đến head
        Node temp = head;
        //Khai báo đối tượng Object để nhận dữ liệu trả về
        Object data;

        //Nếu index = 0 thì trả về data hiện tại và head mới sẽ là node kế tiếp
        if(index == 0){
            data = temp.data;
            head = temp.next;
        }
        else {
            //Nếu index > 0 cho con trỏ chạy đến index - 1
            for(int i=0; i<index-1 && temp.next != null; i++){
                temp = temp.next;
            }
            //data trỏ đến node index
            data = temp.next.data;
            //node index trỏ tới index + 1
            temp.next = temp.next.next;
        }
        numNodes--;
        return (E) data;
    }

    public boolean remove(E element){
        //remove nếu đối tượng là head
        if(head.data.equals(element)){
            remove(0);
            return true;
        }
        else {
            //Khai báo 1 node trỏ đến head
            Node temp = head;
            //Cho vòng lặp chạy đến hết danh sách
            while (temp.next != null){
                //Nếu tồn tại 1 phần từ có data bằng data truyền vào thì node đó sẽ trỏ đến Node thứ 2 kế tiếp
                if(temp.next.data.equals(element)){
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }

    public Object get(int index){
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public boolean contains(E element){
        Node temp = head;
        while (temp.next != null){
            if(temp.data.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        if (temp.data.equals(element)){
            return true;
        }
        return false;
    }

    public int size(){
        return numNodes;
    }

    public MyLinkedList<E> clone(){
        //Nếu số phần tử = 0 thì throw exception
        if(numNodes == 0){
            throw new NullPointerException();
        }
        //Khai báo danh sách trả về
        MyLinkedList<E> temp = new MyLinkedList<E>();
        //Khai báo node trỏ đến head
        Node tempNode = head;
        temp.addFirst((E) tempNode.data);
        //add tất cả node kế tiếp vào danh sách
        while (tempNode != null){
            temp.addLast((E) tempNode.data);
            tempNode = tempNode.next;
        }
        return temp;
    }

    public int indexOf(E o){
        Node temp = head;
        for(int i=0; i<numNodes; i++){
            if((E)temp.getData()== o)
                return i;
            temp=temp.next;
            }
        return -1;
        }
    }
