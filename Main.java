void main() {
        double vize1 = 60.0;
        double vize2 = 70.0;
        double fnal = 75.0;
        double ortalama = (vize1 * 0.25 + vize2 * 0.25 + fnal * 0.5);
        
        if (ortalama >= 85) {
            System.out.println("Takdir aldın, ortalaman: " + ortalama);
        } 
        else if (ortalama >= 75) {
            System.out.println("Teşekkür aldın, ortalaman: " + ortalama);
        } 
        else if (ortalama >= 50) {
            System.out.println("Geçtin, ortalaman: " + ortalama);
        } 
        else {
            System.out.println("Kaldın, ortalaman: " + ortalama);
        }
    }
  
