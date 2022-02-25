class Node(var data: Int) {

    var followedWay: Node? = null

    fun appendToEnd(data: Int) {
        val end = Node(data)
        var n: Node? = this

        while (n!!.followedWay != null) {
            n = n.followedWay
        }

        n.followedWay = end
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    fun printNodes() {
        var firstCustomer = this

        val result = StringBuilder()

        while (firstCustomer.followedWay != null){
            result.append("\n Going to customer -> ").append(firstCustomer.data)
            firstCustomer = firstCustomer.followedWay!!

            if (firstCustomer.followedWay == null){
                result.append("\n Going to last Customer -> ").append(firstCustomer.data).append("\n All customers visited !")
            }
        }

        print(result)
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    fun length(node: Node?): Int {
        var size = 0
        var customer = node

        while (customer?.followedWay != null){
            customer = customer.followedWay
            size++
        }

        size++
        print("\n Total Customers = $size")
        return size
    }

    // TODO:: Implement to return the sum of the Nodes
    fun sumOfNodes(): Int {
        var total = 0

        var firstCustomer = this

        while (firstCustomer.followedWay != null){
            total += firstCustomer.data

            firstCustomer = firstCustomer.followedWay!!

            if (firstCustomer.followedWay == null){
                total += firstCustomer.data
            }
        }

        print("\n Used gas for customers = $total")
        return total
    }

    fun deleteNode(head: Node, data: Int): Node? {
        var n: Node = head

        if(n.data == data) {
            return head.followedWay
        }
        // TODO:: Implement the proper loop in order to remove given data
        var lastCustomer: Node? = null

        while (n.data != data){
            lastCustomer = n
            n = n.followedWay!!
        }

        lastCustomer?.followedWay = n.followedWay

        print("\n Customer $data Deleted")
        return head
    }
}