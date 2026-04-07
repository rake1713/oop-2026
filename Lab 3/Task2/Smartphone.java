class Smartphone implements SmartConnect {
    @Override
    public void charge() {
        System.out.println("Смартфон заряжается быстро (Fast Charge)...");
    }

    @Override
    public void transferData() {
        System.out.println("Смартфон синхронизирует фотографии с компьютером...");
    }
}