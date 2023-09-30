#include <iostream>
using namespace std;

int main() {
    // Variabel dan tipe data
    int jumlahData;
    float total = 0;
    float rataRata;

    // Input
    cout << "Masukkan jumlah data: ";
    cin >> jumlahData;

    // Array satu dimensi
    float data[jumlahData];

    // Input data menggunakan while loop
    int i = 0;
    while (i < jumlahData) {
        cout << "Masukkan data ke-" << i + 1 << ": ";
        cin >> data[i];
        i++;
    }

    // Menghitung total menggunakan for loop
    for (int j = 0; j < jumlahData; j++) {
        total += data[j];
    }

    // Menghitung rata-rata
    rataRata = total / jumlahData;

    // Output
    cout << "Rata-rata: " << rataRata << endl;

    return 0;
}

