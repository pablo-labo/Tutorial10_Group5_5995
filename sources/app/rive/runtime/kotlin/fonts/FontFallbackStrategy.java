package app.rive.runtime.kotlin.fonts;

import app.rive.runtime.kotlin.fonts.Fonts;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.zr4;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001a\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/FontFallbackStrategy;", "", "getFont", "", "", "Lapp/rive/runtime/kotlin/fonts/FontBytes;", "weight", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "Companion", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public interface FontFallbackStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\u000b\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R(\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/FontFallbackStrategy$Companion;", "", "<init>", "()V", "Lj6g;", "cppResetFontCache", "", "uWeight", "", "", "Lapp/rive/runtime/kotlin/fonts/FontBytes;", "pickFont", "(I)Ljava/util/List;", "Ljava/lang/ref/WeakReference;", "Lapp/rive/runtime/kotlin/fonts/FontFallbackStrategy;", "stylePickerRef", "Ljava/lang/ref/WeakReference;", "value", "getStylePicker", "()Lapp/rive/runtime/kotlin/fonts/FontFallbackStrategy;", "setStylePicker", "(Lapp/rive/runtime/kotlin/fonts/FontFallbackStrategy;)V", "stylePicker", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static WeakReference<FontFallbackStrategy> stylePickerRef;

        private Companion() {
        }

        public final native void cppResetFontCache();

        public final FontFallbackStrategy getStylePicker() {
            WeakReference<FontFallbackStrategy> weakReference = stylePickerRef;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public final List<byte[]> pickFont(int uWeight) {
            FontFallbackStrategy stylePicker = getStylePicker();
            return stylePicker == null ? zr4.a : stylePicker.getFont(Fonts.Weight.INSTANCE.fromInt(uWeight));
        }

        public final void setStylePicker(FontFallbackStrategy fontFallbackStrategy) {
            if (getStylePicker() != fontFallbackStrategy) {
                stylePickerRef = fontFallbackStrategy != null ? new WeakReference<>(fontFallbackStrategy) : null;
                cppResetFontCache();
            }
        }
    }

    List<byte[]> getFont(Fonts.Weight weight);
}
