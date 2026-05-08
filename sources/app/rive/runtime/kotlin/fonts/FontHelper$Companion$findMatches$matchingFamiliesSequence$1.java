package app.rive.runtime.kotlin.fonts;

import app.rive.runtime.kotlin.fonts.Fonts;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.mj8;
import defpackage.wl7;
import defpackage.wve;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class FontHelper$Companion$findMatches$matchingFamiliesSequence$1 extends mj8 implements Function1<Map.Entry<? extends String, ? extends Fonts.Family>, Boolean> {
    final /* synthetic */ String $familyName;
    final /* synthetic */ String $lang;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontHelper$Companion$findMatches$matchingFamiliesSequence$1(String str, String str2) {
        super(1);
        this.$familyName = str;
        this.$lang = str2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Boolean invoke2(Map.Entry<String, Fonts.Family> entry) {
        entry.getClass();
        Fonts.Family value = entry.getValue();
        boolean z = true;
        if ((this.$familyName != null && !wve.E(value.getName(), this.$familyName, true)) || (this.$lang != null && !wl7.b(value.getLang(), this.$lang))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Map.Entry<? extends String, ? extends Fonts.Family> entry) {
        return invoke2((Map.Entry<String, Fonts.Family>) entry);
    }
}
