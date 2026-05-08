package app.rive.runtime.kotlin.fonts;

import app.rive.runtime.kotlin.fonts.Fonts;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.mj8;
import defpackage.wl7;
import defpackage.wve;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "family", "Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "invoke", "(Lapp/rive/runtime/kotlin/fonts/Fonts$Family;)Ljava/lang/Boolean;"}, k = 3, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class FontHelper$Companion$findMatches$matchingFamiliesSequence$3 extends mj8 implements Function1<Fonts.Family, Boolean> {
    final /* synthetic */ String $familyName;
    final /* synthetic */ String $lang;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontHelper$Companion$findMatches$matchingFamiliesSequence$3(String str, String str2) {
        super(1);
        this.$familyName = str;
        this.$lang = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Fonts.Family family) {
        family.getClass();
        boolean z = true;
        if ((this.$familyName != null && !wve.E(family.getName(), this.$familyName, true)) || (this.$lang != null && !wl7.b(family.getLang(), this.$lang))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
