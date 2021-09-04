package org.someone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ytuScript {

    public static WebDriver loginToSystem(String username, String password){
        WebDriver driver = Commands.openChrome();
        driver.get("https://online.yildiz.edu.tr/Account/Login?ReturnUrl=%2f");
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("" +
                        "/html/body/main/div/div/div/div/div/div/form/div[2]/div[1]/input")));
        driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div/form/div[2]/div[1]/input")).sendKeys(username);
        driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div/form/div[3]/div[2]/input")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div/form/div[1]/div[1]/select/option[3]")).click();
        driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div/form/div[4]/div[2]/button")).click();
        return driver;
    }

    public static void registerLesson(WebDriver driver, String lectureName){
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nav/div[1]/a[3]/span[1]")));
        switch (lectureName){
            case "Elektromekanik Enerji Dönüşüm Sistemleri":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/30834");
                break;
            case "Endüstriyel Otomasyon":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/30830");
                break;
            case "Mühendisler İçin İstatistik Ve Deneysel Yöntemler":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/30828");
                break;
            case "Termodinamik":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/30826");
                break;
            case "Fizik 2":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/28904");
                break;
            case "Atatürk İlkeleri Ve İnkılap Tarihi 2" :
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/28104");
                break;
            case "Hidrolik - Pnömatik Sistemler":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/30836");
                break;
            case "Proses Tekniği":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/21076");
                break; // buraya kadar benim derslerim
            //ömer
            case "Diferansiyel Denklemler Kont. Müh.":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/20042");
                break;
            case "Elektrik Devre Temelleri Kont. Müh.":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/19301");
                break;
            case "Programlama Dilleri Kont. Müh.":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/16767");
                break;
            case "Kontrol Sistemleri Ölçme Ve Algılayıcılar Kont. Müh.":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/19303");
                break;
            case "İşaret Ve Sistemler Kontrol Mühendisliğinde Uygulamaları Kont. Müh.":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/19300");
                break;
            case "İngilizce Okuma Ve Konuşma Kont. Müh.":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/20419");
                break;
            case "Analog Elektronik Kont. Müh.":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/19304");
                break;
            // cerenin
            case "Lineer Programlama Teorisi Mat. Müh.":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/21324");
                break;
            case "İstatistik Mat. Müh.":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/21320");
                break;
            case "Sigorta Matematiğine Giriş Mat. Müh.":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/21313");
                break;
            case "Diferansiyel Denklemler Mat. Müh.":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/21308");
                break;
            case "Nümerik Analiz 1 Mat. Müh.":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/21306");
                break;
            case "Algoritmalar ve Veri Yapıları Mat. Müh.":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/21303");
                break;
            case "Analiz 1 Mat. Müh.":
                driver.get("https://online.yildiz.edu.tr/?transaction=LMS.EDU.LessonProgram.ViewOnlineLessonProgramForStudent/21287");
                break;
            default:
                System.out.println("Ders Bulunamadı");
                break;
        }

       new WebDriverWait(driver, 60)
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Derse Katıl")));
        driver.findElement(By.linkText("Derse Katıl")).click();

        driver.close();
        driver.quit();

    }

    public static void startProcedure(String lectureName) throws InterruptedException {
        registerLesson(loginToSystem(App.username, App.password), lectureName);
        TimeUnit.MINUTES.sleep(10);


    }

    public static void automatedLectureAttender() throws InterruptedException {
        while (true) {
            List<String> l = myFileUtil.readFileInList("C:\\Users\\" + App.hostname + "\\Documents\\mylittlepony\\program.txt");
            if(l.isEmpty()){
                System.out.println("Program sonlandırılıyor!");
                break;
            }
            for (String s : l) {
                var lectureDay = s.substring(0, 3);
                var lectureHMS = s.substring(4, 12);
                var lectureName = s.substring(13);

                var now = new Date();
                var hms = now.toString().substring(11, 19);
                var today = now.toString().substring(0, 3);

                var lectureHour = Integer.parseInt(lectureHMS.substring(0, 2));
                var dayHour = Integer.parseInt(hms.substring(0, 2));
                var lecDayMin = Integer.parseInt(lectureHMS.substring(3, 5).trim());
                var dayMin = Integer.parseInt(hms.substring(3, 5).trim());
                var isfreeday = isFreeDay(today, lectureDay, dayHour, lectureHour);
                if(isfreeday > 0){
                    System.out.println("Bir sonraki dersiniz : " + s);
                    var timeLeft = (24 * 60 * isfreeday + 60 * (lectureHour - dayHour) + lecDayMin - dayMin) * 60;
                    while (timeLeft-- != 0) {
                        var secondsLeft = timeLeft % 60;
                        var minutesLeft = timeLeft / 60 % 60;
                        var hoursLeft = timeLeft / 3600 % 24;
                        var daysLeft = timeLeft / (3600 * 24);
                        System.out.printf("\rDerse kalan süre: %d gün %d saat %d dakika %d saniye ",
                                daysLeft, hoursLeft, minutesLeft, secondsLeft);
                        TimeUnit.SECONDS.sleep(1);
                    }
                    startProcedure(lectureName);
                }

                else if (lectureHour > dayHour && lectureDay.equals(today)) {
                    System.out.println("Bir sonraki dersiniz : " + s);
                    System.out.println("Ders saati bekleniyor...");
                    long timeLeft = ((lectureHour - dayHour) * 60 + (lecDayMin - dayMin)) * 60;
                    while (timeLeft-- != 0) {
                        var hoursLeft = timeLeft / 3600;
                        var minutesLeft = timeLeft / 60 - hoursLeft * 60;
                        var secondsLeft = timeLeft % 60;
                        System.out.printf("\rDerse kalan süre %d saat %d dakika %d saniye ",
                                hoursLeft, minutesLeft, secondsLeft);
                        TimeUnit.SECONDS.sleep(1);
                    }
                    System.out.println("\nDerse giriliyor...");
                    startProcedure(lectureName);
                }
            }
        }
    }

    public static int isFreeDay(String today, String lectureDay, Integer dayHour, Integer lectureHour){
        ArrayList<String> days = new ArrayList<>(List.of("Sat", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri"));
        if (today.equals("Fri") && dayHour > lectureHour)
            return 3;
        return days.indexOf(lectureDay) - days.indexOf(today);
    }

}



