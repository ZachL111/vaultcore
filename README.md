# vaultcore

`vaultcore` is a Kotlin project in security tooling. Its focus is to validate password vault envelope metadata and KDF policy choices.

## Purpose

This is intentionally local and self-contained so it can be inspected without credentials, services, or seeded history.

## Vaultcore Review Notes

The first comparison I would make is `replay exposure` against `policy width` because it shows where the rule is most opinionated.

## What Is Covered

- `fixtures/domain_review.csv` adds cases for trust boundary and claim drift.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/vaultcore-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `replay exposure` and `policy width`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Implementation Notes

The fixture data drives the tests. The code stays thin, while `metadata/domain-review.json` and `config/review-profile.json` explain what each case is meant to protect.

The Kotlin code keeps the review rule close to the tests.

## Command

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Audit Path

The same command runs the local verification path. The highest-scoring domain case is `edge` at 202, which lands in `ship`. The most cautious case is `recovery` at 158, which lands in `ship`.

## Limits

The repository is intentionally scoped to local checks. I would expand it by adding adversarial fixtures before adding features.
