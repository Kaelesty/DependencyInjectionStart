package com.example.dependencyinjectionstart.example1


class Component {

	private fun getComputer() = Computer(
		Monitor(),
		ComputerTower(
			Storage(),
			Memory(),
			Processor()
		),
		Keyboard(),
		Mouse()
	)

	fun inject(activity: Activity) {
		activity.computer = getComputer()
	}
}