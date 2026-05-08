package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum h19 {
    TRIGGER("trigger"),
    PLATFORM("platform"),
    APP_LOCALE("appLocale"),
    USER_PREFERENCE_COUNTRY("userPreferenceCountry"),
    USER_PREFERENCE_LANGUAGE("userPreferenceLanguage"),
    INDEED_LOCALE("indeedLocale"),
    IP_COUNTRY("ipCountry"),
    IP_COUNTRY_OVERRIDE("ipCountryOverride"),
    PRE_API_INIT("pre_api_init"),
    POST_API_INIT("post_api_init"),
    COUNTRY_SELECTOR("country_selector"),
    IP_COUNTRY_MISMATCH("ip_country_mismatch"),
    IP_COUNTRY_OPT_IN("ip_country_opt_in");

    private final String value;

    h19(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }
}
