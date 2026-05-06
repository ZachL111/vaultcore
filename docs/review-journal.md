# Review Journal

The review surface for `vaultcore` is deliberately narrow: one fixture, one scoring rule, and one local check.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its security tooling focus without claiming live deployment or external usage.

## Cases

- `baseline`: `trust boundary`, score 167, lane `ship`
- `stress`: `claim drift`, score 193, lane `ship`
- `edge`: `replay exposure`, score 202, lane `ship`
- `recovery`: `policy width`, score 158, lane `ship`
- `stale`: `trust boundary`, score 185, lane `ship`

## Note

The repository should be understandable without pretending it is larger than it is.
