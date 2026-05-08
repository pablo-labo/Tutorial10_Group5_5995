package app.rive.runtime.kotlin.fonts;

import app.rive.runtime.kotlin.fonts.Fonts;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.mj8;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "it", "", "", "invoke"}, k = 3, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class FontHelper$Companion$findMatches$matchingFamiliesSequence$2 extends mj8 implements Function1<Map.Entry<? extends String, ? extends Fonts.Family>, Fonts.Family> {
    public static final FontHelper$Companion$findMatches$matchingFamiliesSequence$2 INSTANCE = new FontHelper$Companion$findMatches$matchingFamiliesSequence$2();

    public FontHelper$Companion$findMatches$matchingFamiliesSequence$2() {
        super(1);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Fonts.Family invoke2(Map.Entry<String, Fonts.Family> entry) {
        entry.getClass();
        return entry.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Fonts.Family invoke(Map.Entry<? extends String, ? extends Fonts.Family> entry) {
        return invoke2((Map.Entry<String, Fonts.Family>) entry);
    }
}
