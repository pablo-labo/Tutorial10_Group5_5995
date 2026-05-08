package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class usb {
    public static final usb a;
    public static final usb b;
    public static final usb c;
    public static final /* synthetic */ usb[] d;

    static {
        usb usbVar = new usb("NONE", 0);
        a = usbVar;
        usb usbVar2 = new usb("HIGH_SALARY", 1);
        b = usbVar2;
        usb usbVar3 = new usb("LOW_SALARY", 2);
        c = usbVar3;
        d = new usb[]{usbVar, usbVar2, usbVar3};
    }

    public usb() {
        throw null;
    }

    public static usb valueOf(String str) {
        return (usb) Enum.valueOf(usb.class, str);
    }

    public static usb[] values() {
        return (usb[]) d.clone();
    }
}
