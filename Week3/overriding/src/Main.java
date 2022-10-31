public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] baseKrediManagers = new BaseKrediManager[]{new TarımKrediManager(),new OgretmenKrediManager(),new OgrencikrediManager()};
        for (BaseKrediManager baseKrediManager: baseKrediManagers){
            System.out.println(baseKrediManager.hesapla(1000));
        }
    }
}
