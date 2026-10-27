# maddi Kotlin demo

A small Gradle project for trying maddi's IDE plugins by hand on Kotlin: open it, run the analysis, and check that
the hints, the gutter icons and the tool window say what this project says they should.

It is the Kotlin twin of `maddi-java-demo`: the same classes in the same packages, written as Kotlin would write
them (`object`, data classes, properties, extension functions). Each class's KDoc says what to look for, and
[EXPECTED-HINTS.md](EXPECTED-HINTS.md) lists, per declaration, exactly what the analysis computes. Where the two
demos differ, that is the Kotlin front end's doing, and worth a look.

## Opening it

- **IntelliJ IDEA:** *File → Open* on this directory, as a Gradle project. Install the maddi plugin, set its JDK (25
  or later) under *Settings → Tools → maddi*, then *Tools → Analyze with maddi*. The plugin offers to download the
  Kotlin front end the first time it meets Kotlin sources.
- Builds with `./gradlew build` (Gradle 9.7.1, Kotlin 2.4.0, JDK 21 toolchain). The only dependencies are
  `io.codelaser:maddi-annotation` and `io.codelaser:maddi-support` 0.9.5 from Maven Central, for the contracts and
  the eventually immutable classes.

## What is where

| Package | Files | Shows |
|---|---|---|
| `demo.modification` | `Counter`, `Bag`, `ListTools`, `Item`, `Elements`, `Registry` | `@Modified` / `@NotModified`; `@Container`; `@Modified(hc=true)` where only the elements change |
| `demo.immutable` | `Point`, `Pair`, `Color`, `Snapshot`, `Tags`, `LazyName`, `Shape` (with `Circle`) | `@ImmutableContainer`, with and without hidden content; `@FinalFields`; a contract on an interface |
| `demo.independence` | `Inventory`, `Box`, `Wrapper` | `@Independent`, `@Independent(hc=true)`, `@Dependent`; `@UnmodifiableView` |
| `demo.method` | `Sentence`, `Checks`, `Person`, `Ranges` | `@Fluent`, `@Identity`, `@Commutable` |
| `demo.nullability` | `Lookup` | Kotlin's own nullable types |
| `demo.eventual` | `Config`, `Document` | `@Mark`, `@Only`, `@TestMark`, `@Immutable(after=...)`, `@NotModified(after=...)` |
| `demo.rare` | `Audit`, `Settings` (with `SettingsClient`), `Report`, `Clock`, `Strings` | `@IgnoreModifications`, `@StaticSideEffects`, `@Finalizer`; an `object`; extension functions |
| `demo.guard` | `WrongImmutable`, `WrongContainer` | wrong contracts on purpose: two guard findings, with their why-chain |

## Differences from the Java demo, as of 2026-10-27

So that a missing hint is not mistaken for a broken plugin:

- **No nullability hints:** a Kotlin type already says whether it takes null, so the plugin shows no inferred
  `@Nullable`/`@NotNull` on Kotlin declarations.
- **Kotlin's generated accessors show no hints**: the analysis does give `getName`/`setName` and the others their
  `@GetSet`, but the accessors have no source position of their own, so the plugin has nowhere to put it. The
  property shows its field's verdict.
- **By design:** `Snapshot` is `@FinalFields` and `@Dependent`, because `toList()` returns an `ArrayList` that the
  getter hands out (Java's `List.copyOf` is unmodifiable); and `LazyName.name`, a `var`, is never `@Final`.
- **Under investigation:** `Snapshot` and `Lookup` also show `@Immutable(hc=true,after="lines")` and
  `after="entries"`, an eventual verdict on a class without a mark.
- `@Commutable` (`Ranges`) is not shown, as in Java.
