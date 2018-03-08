package generics.simple;

class BoxPrinter<H> {
	private H val;

	public BoxPrinter(H arg) {
		val = arg;
	}

	public String toString() {
		return "[" + val + "]";
	}
}