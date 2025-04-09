class Courier(
    private val courierId: String,
    private val name: String,
    private val phone: String,
    private var currentRoute: MutableList<Order> = mutableListOf()
) {
    fun assignOrder(order: Order) {
        currentRoute.add(order)
        println("Order ${order.orderId} assigned to courier $name")
    }

    @Suppress("UNUSED")
    fun displayCourierInfo() {
        println("Courier ID: $courierId, Name: $name, Phone: $phone")
    }

    @Suppress("UNUSED")
    fun getContactInfo(): String {
        return "Courier $name can be reached at $phone"
    }

    @Suppress("UNUSED")
    fun getCurrentRoute(): List<Order> {
        return currentRoute.toList()
    }
}
