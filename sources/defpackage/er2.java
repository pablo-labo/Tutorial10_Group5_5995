package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes3.dex */
public enum er2 {
    FirstName(R.string.contact_information_first_name_label),
    LastName(R.string.contact_information_last_name_label),
    /* JADX INFO: Fake field, exist only in values array */
    PhoneNumber(R.string.contact_information_phone_number_label),
    Country(R.string.contact_information_country_label),
    CityState(R.string.contact_information_city_state_label),
    PostalCode(R.string.contact_information_postal_code_label);

    private final int labelStringResId;

    er2(int i) {
        this.labelStringResId = i;
    }
}
