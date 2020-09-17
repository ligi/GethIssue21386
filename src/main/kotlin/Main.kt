import org.web3j.protocol.Web3j
import org.web3j.protocol.websocket.WebSocketService

fun main() {

    val socketService = WebSocketService("wss://mainnet.infura.io/ws/v3/<infuraID>u", true);

    println("Started >>>>>>> ")

    val web3jSocket = Web3j.build(socketService);
    socketService.connect();

    web3jSocket.transactionFlowable().subscribe { tx ->
        println("Tx Hash > " +tx.hash)
    }

}

