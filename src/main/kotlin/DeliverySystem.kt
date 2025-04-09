class DeliverySystem {
    private val orders = mutableListOf<Order>()
    private val customers = mutableListOf<Customer>()
    private val couriers = mutableListOf<Courier>()

    fun createOrder(customer: Customer, items: List<Item>, deliveryAddress: String): Order {
        val order = Order(
            orderId = "ORD${orders.size + 1}",
            customer = customer,
            items = items,
            status = "Обробляється",
            deliveryAddress = deliveryAddress
        )
        orders.add(order)
        customer.placeOrder(order)
        return order
    }

    fun assignOrderToCourier(order: Order, courier: Courier) {
        courier.assignOrder(order)
        order.updateStatus("Відправлено")
    }

    fun trackOrder(orderId: String): String? {
        return orders.find { it.orderId == orderId }?.status
    }

    fun updateOrderStatus(orderId: String, status: String) {
        orders.find { it.orderId == orderId }?.updateStatus(status)
    }

    fun addCustomer(customer: Customer) {
        customers.add(customer)
    }

    fun addCourier(courier: Courier) {
        couriers.add(courier)
    }
}
