public int powerN(int base, int n) {
  if (n <= 1) {
    return base;
  } else {
    return powerN(base, n - 1) * base;
  }
}

