void main() {
        double vize1 = 60.0;
        double vize2 = 70.0;
        double fnal = 75.0;
        double ortalama = (vize1 * 0.25 + vize2 * 0.25 + fnal * 0.5);
        String mesaj;
        if (ortalama >= 85) {
            mesaj="Takdir aldın";
        } 
        else if (ortalama >= 75) {
            mesaj="Teşekkür aldın";
        } 
        else if (ortalama >= 50) {
            mesaj="Geçtin";
        } 
        else {
            mesaj="Kaldın";
        }
  System.out.println(mesaj+","+"ortalaman:"+ortalama);
    }
  
