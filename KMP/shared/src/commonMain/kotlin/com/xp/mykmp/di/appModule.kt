package com.xp.mykmp.di
import com.xp.mykmp.domain.datasource.SrvcManager
//import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val networkModule = module {
	single {
		SrvcManager()
	}
}

val dispatcherModule = module {
	single<DispatcherProvider> { DefaultDispatcherProvider() }
}

val appModule = module {
	includes(dispatcherModule, networkModule)
	
//	viewModel {
//		MainViewModel(get())
//	}
}