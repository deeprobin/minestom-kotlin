package de.deeprobin.minestom

import net.minestom.server.MinecraftServer
import net.minestom.server.world.Difficulty
import java.io.Closeable

class MinestomServerContext internal constructor(private val server: MinecraftServer): Closeable {

    var brandName: String
        get() = MinecraftServer.getBrandName()
        set(value) {
            MinecraftServer.setBrandName(value)
        }

    var rateLimit: Int
        get() = MinecraftServer.getRateLimit()
        set(value) {
            MinecraftServer.setRateLimit(value)
        }

    var maxPacketSize: Int
        get() = MinecraftServer.getMaxPacketSize()
        set(value) {
            MinecraftServer.setMaxPacketSize(value)
        }

    var difficulty: Difficulty
        get() = MinecraftServer.getDifficulty()
        set(value) {
            MinecraftServer.setDifficulty(value)
        }

    val globalEventHandler = MinecraftServer.getGlobalEventHandler()

    val nettyServer = MinecraftServer.getNettyServer()

    val instanceManager = MinecraftServer.getInstanceManager()

    val blockManager = MinecraftServer.getBlockManager()

    val commandManager = MinecraftServer.getCommandManager()

    val recipeManager = MinecraftServer.getCommandManager()

    val storageManager = MinecraftServer.getStorageManager()

    val dataManager = MinecraftServer.getDataManager()

    val teamManager = MinecraftServer.getTeamManager()

    val schedulerManager = MinecraftServer.getSchedulerManager()

    val benchmarkManager = MinecraftServer.getBenchmarkManager()

    val exceptionManager = MinecraftServer.getExceptionManager()

    val connectionManager = MinecraftServer.getConnectionManager()

    val packetProcessor = MinecraftServer.getPacketProcessor()

    val started = MinecraftServer.isStarted()

    val stopping = MinecraftServer.isStopping()

    var chunkViewDistance: Int
        get() = MinecraftServer.getChunkViewDistance()
        set(value) {
            MinecraftServer.setChunkViewDistance(value)
        }

    var entityViewDistance: Int
        get() = MinecraftServer.getEntityViewDistance()
        set(value) {
            MinecraftServer.setEntityViewDistance(value)
        }

    var groupedPacket: Boolean
        get() = MinecraftServer.hasGroupedPacket()
        set(value) {
            MinecraftServer.setGroupedPacket(value)
        }

    val responseDataConsumer = MinecraftServer.getResponseDataConsumer()

    val lootTableManager = MinecraftServer.getLootTableManager()

    val dimensionTypeManager = MinecraftServer.getDimensionTypeManager()

    val biomeManager = MinecraftServer.getBiomeManager()

    val advancementManager = MinecraftServer.getAdvancementManager()

    val extensionManager = MinecraftServer.getExtensionManager()

    val tagManager = MinecraftServer.getTagManager()

    val updateManager = MinecraftServer.getUpdateManager()

    var shouldProcessNettyErrors: Boolean
        get() = MinecraftServer.shouldProcessNettyErrors()
        set(value) {
            MinecraftServer.setShouldProcessNettyErrors(value)
        }

    fun stopCleanly() {
        MinecraftServer.stopCleanly()
    }

    override fun close() {
        MinecraftServer.stopCleanly()
    }
}