package de.deeprobin.minestom.extension

import net.minestom.server.MinecraftServer
import net.minestom.server.world.Difficulty

var MinecraftServer.compressionThreshold: Int
    get() = MinecraftServer.getCompressionThreshold()
    set(value) {
        MinecraftServer.setCompressionThreshold(value)
    }

var MinecraftServer.packetCaching: Boolean
    get() = MinecraftServer.hasPacketCaching()
    set(value) {
        MinecraftServer.setPacketCaching(value)
    }

var MinecraftServer.nettyThreadCount: Int
    get() = MinecraftServer.getNettyThreadCount()
    set(value) {
        MinecraftServer.setNettyThreadCount(value)
    }

var MinecraftServer.brandName: String
    get() = MinecraftServer.getBrandName()
    set(value) {
        MinecraftServer.setBrandName(value)
    }

var MinecraftServer.rateLimit: Int
    get() = MinecraftServer.getRateLimit()
    set(value) {
        MinecraftServer.setRateLimit(value)
    }

var MinecraftServer.maxPacketSize: Int
    get() = MinecraftServer.getMaxPacketSize()
    set(value) {
        MinecraftServer.setMaxPacketSize(value)
    }

var MinecraftServer.difficulty: Difficulty
    get() = MinecraftServer.getDifficulty()
    set(value) {
        MinecraftServer.setDifficulty(value)
    }

val MinecraftServer.globalEventHandler get() = MinecraftServer.getGlobalEventHandler()
val MinecraftServer.nettyServer get() = MinecraftServer.getNettyServer()
val MinecraftServer.instanceManager get() = MinecraftServer.getInstanceManager()
val MinecraftServer.blockManager get() = MinecraftServer.getBlockManager()
val MinecraftServer.commandManager get() = MinecraftServer.getCommandManager()
val MinecraftServer.recipeManager get() = MinecraftServer.getRecipeManager()
val MinecraftServer.storageManager get() = MinecraftServer.getStorageManager()
val MinecraftServer.dataManager get() = MinecraftServer.getDataManager()
val MinecraftServer.teamManager get() = MinecraftServer.getTeamManager()
val MinecraftServer.schedulerManager get() = MinecraftServer.getSchedulerManager()
val MinecraftServer.benchmarkManager get() = MinecraftServer.getBenchmarkManager()
val MinecraftServer.exceptionManager get() = MinecraftServer.getExceptionManager()
val MinecraftServer.connectionManager get() = MinecraftServer.getConnectionManager()
val MinecraftServer.packetProcessor get() = MinecraftServer.getPacketProcessor()
val MinecraftServer.started get() = MinecraftServer.isStarted()
val MinecraftServer.stopping get() = MinecraftServer.isStopping()

var MinecraftServer.chunkViewDistance: Int
    get() = MinecraftServer.getChunkViewDistance()
    set(value) {
        MinecraftServer.setChunkViewDistance(value)
    }

var MinecraftServer.entityViewDistance: Int
    get() = MinecraftServer.getEntityViewDistance()
    set(value) {
        MinecraftServer.setEntityViewDistance(value)
    }

var MinecraftServer.groupedPacket: Boolean
    get() = MinecraftServer.hasGroupedPacket()
    set(value) {
        MinecraftServer.setGroupedPacket(value)
    }

val MinecraftServer.responseDataConsumer get() = MinecraftServer.getResponseDataConsumer()
val MinecraftServer.lootTableManager get() = MinecraftServer.getLootTableManager()
val MinecraftServer.dimensionTypeManager get() = MinecraftServer.getDimensionTypeManager()
val MinecraftServer.biomeManager get() = MinecraftServer.getBiomeManager()
val MinecraftServer.advancementManager get() = MinecraftServer.getAdvancementManager()
val MinecraftServer.extensionManager get() = MinecraftServer.getExtensionManager()
val MinecraftServer.tagManager get() = MinecraftServer.getTagManager()
val MinecraftServer.updateManager get() = MinecraftServer.getUpdateManager()
var MinecraftServer.shouldProcessNettyErrors: Boolean
    get() = MinecraftServer.shouldProcessNettyErrors()
    set(value) {
        MinecraftServer.setShouldProcessNettyErrors(value)
    }