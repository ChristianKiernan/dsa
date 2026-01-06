import json, sys, glob
from datetime import datetime

if len(sys.argv) != 2:
    print("Usage: python scripts/mark_solved.py path/to/meta.json")
    sys.exit(1)

target = sys.argv[1]

# find max solved_order
max_order = 0
for f in glob.glob("problems/**/meta.json", recursive=True):
    try:
        with open(f) as fh:
            data = json.load(fh)
            if "solved_order" in data:
                max_order = max(max_order, int(data["solved_order"]))
    except Exception:
        pass

next_order = max_order + 1
now = datetime.now().astimezone().isoformat()

with open(target) as fh:
    meta = json.load(fh)

meta["solved_order"] = next_order
meta["solved_at"] = now

with open(target, "w") as fh:
    json.dump(meta, fh, indent=2)

print(f"Marked solved: order={next_order}, time={now}")
