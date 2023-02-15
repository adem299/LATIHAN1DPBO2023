#include <iostream>
#include <string>

using namespace std;

class Mahasiswa {
private:
    string name;
    string NIM;
    string prodi;
    string fakultas;

public:
    Mahasiswa() {}
    
    Mahasiswa(string name, string NIM, string prodi, string fakultas) {
        this->name = name;
        this->NIM = NIM;
        this->prodi = prodi;
        this->fakultas = fakultas;
    }

    // getter dan setter
    string getName() {
        return name;
    }

    string getNIM() {
        return NIM;
    }

    string getProdi() {
        return prodi;
    }

    string getFakultas() {
        return fakultas;
    }

    void setName(string name) {
        this->name = name;
    }

    void setNIM(string NIM) {
        this->NIM = NIM;
    }

    void setProdi(string prodi) {
        this->prodi = prodi;
    }

    void setFakultas(string fakultas) {
        this->fakultas = fakultas;
    }

    // Destructor
    ~Mahasiswa() {}
};