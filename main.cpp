#include <iostream>

class komplex {

private:

  static int N;

  double re;
  double im;

public:

  // üres konstruktor
  komplex() {
  	re = 0;
  	im = 0;
  	N++;
  }

  // konstruktor
  komplex(double r) {
  	re = r;
  	im = 0;
  	N++;
  }

  // konstruktor
  komplex(double r, double i) {
  	re = r;
  	im = i;
  	N++;
  }

  // másoló konstruktor
  komplex(const komplex & z) {
  	re = z.re;
  	im = z.im;
  	N++;
  }

  void print() {
  	std::cout << this->re << " " << this->im << "\n";
  }

  double real() const {
  	return re;
  }

  double imag() const {
  	return im;
  }

  void real(double r) {
  	re = r;
  }

  void imag(double i) {
  	im = i;
  }

  static int count() {
  	return N;
  }
};

int komplex::N = 0;

//   std::cout << a  << b  << c;
// ((std::cout << a) << b) << c;

std::ostream & operator << (std::ostream & s, const komplex & z) {
  return s << z.real() << " " << z.imag();
}

// a+b; operator+(a,b);

komplex operator + (const komplex & a, const komplex & b) {
	return komplex(a.real()+b.real(), a.imag()+b.imag());
}

void f(komplex z) {
  std::cout << "f(): z = "; z.print();
}

int main(int argc, char** argv) {
	komplex a;
	std::cout << "a = " << a << "\n";
	komplex b = 22.0;
	std::cout << "b = " << b << "\n";
	komplex c(22.0, 33.0);
	std::cout << "c = " << c << "\n";
	f(c);
	std::cout << b << " + " << c << " = " << (b+c) << "\n";
	std::cout << "komplex numbers created so far: " << komplex::count() << "\n";
	return 0;
}

