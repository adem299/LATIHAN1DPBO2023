class Mahasiswa():
    __name = ""
    __NIM = ""
    __prodi = ""
    __fakultas = ""

    # constructor
    def __init__(self, name="", NIM="", prodi="", fakultas=""):
        self.__name = name
        self.__NIM = NIM
        self.__prodi = prodi
        self.__fakultas = fakultas

    # Setter methods
    def setName(self, name):
        self.__name = name

    def setNIM(self, NIM):
        self.__NIM = NIM

    def setProdi(self, prodi):
        self.__prodi = prodi

    def setFakultas(self, fakultas):
        self.__fakultas = fakultas

        # Getter methods
    def getName(self):
        return self.__name

    def getNIM(self):
        return self.__NIM

    def getProdi(self):
        return self.__prodi

    def getFakultas(self):
        return self.__fakultas