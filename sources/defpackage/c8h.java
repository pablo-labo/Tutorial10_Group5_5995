package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c8h {
    public static final /* synthetic */ c8h[] a;
    public static final /* synthetic */ wv4 b;
    private final String keyword;

    static {
        c8h[] c8hVarArr = {new c8h("TRUCK_DRIVER_HAZARDOUS_MATERIALS", 0, "H (Hazardous Materials)"), new c8h("TRUCK_DRIVER_SCHOOL_BUS", 1, "S (School bus)"), new c8h("TRUCK_DRIVER_TANK_VEHICLES", 2, "N (Tank vehicles)"), new c8h("TRUCK_DRIVER_PASSENGER_VEHICLES", 3, "P (Passenger vehicles)"), new c8h("TRUCK_DRIVER_TANK_AND_HAZARDOUS", 4, "X (Tank + Hazardous)"), new c8h("TRUCK_DRIVER_TRAILERS", 5, "T (Double/triple trailers)")};
        a = c8hVarArr;
        b = new wv4(c8hVarArr);
    }

    public c8h(String str, int i, String str2) {
        this.keyword = str2;
    }

    public static c8h valueOf(String str) {
        return (c8h) Enum.valueOf(c8h.class, str);
    }

    public static c8h[] values() {
        return (c8h[]) a.clone();
    }

    public final String a() {
        return this.keyword;
    }
}
