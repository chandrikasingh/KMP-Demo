package com.xp.mykmp


class DesktopPlatform: Platform {
	//override val name: String = "${System.getProperty("os.name")} ${System.getProperty("os.version")}"
	
	override val name: String =
		buildString {
			append(System.getProperty("os.name"))
			append(" ")
			append(System.getProperty("os.version"))
			append(" (")
			append(System.getProperty("java.vm.name"))
			append(" ")
			append(System.getProperty("java.version"))
			append(")")
		}
	
}

actual fun getPlatform(): Platform = DesktopPlatform()

