package defpackage;

import com.datadog.android.rum.internal.utils.ViewUtilsKt;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class qed {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof qed) {
            return this.a == ((qed) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "Button" : i == 1 ? "Checkbox" : i == 2 ? "Switch" : i == 3 ? "RadioButton" : i == 4 ? "Tab" : i == 5 ? "Image" : i == 6 ? "DropdownList" : i == 7 ? "Picker" : i == 8 ? "Carousel" : ViewUtilsKt.UNKNOWN_DESTINATION_URL;
    }
}
