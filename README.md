| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Team&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Subdomain | PMs Assigned |&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CI&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | &nbsp;&nbsp;&nbsp;&nbsp;Deploy&nbsp;&nbsp;&nbsp; | &nbsp;Coverage&nbsp;&nbsp; |
| ---- | ---- | ---- | --- | --- | --- |
| supraaa | ACL |  | [![CI](https://github.com/kmaooad/caja22-supraaa/actions/workflows/ci.yml/badge.svg)](https://github.com/kmaooad/caja22-supraaa/actions/workflows/ci.yml) | [![Deploy](https://github.com/kmaooad/caja22-supraaa/actions/workflows/deploy.yml/badge.svg)](https://github.com/kmaooad/caja22-supraaa/actions/workflows/deploy.yml) | [![codecov](https://codecov.io/gh/kmaooad/caja22-supraaa/branch/master/graph/badge.svg?token=0Druoqm94y)](https://codecov.io/gh/kmaooad/caja22-supraaa) |
| independent-team | Competences | &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ✅ | [![CI](https://github.com/kmaooad/caja22-independent-team/actions/workflows/ci.yml/badge.svg)](https://github.com/kmaooad/caja22-independent-team/actions/workflows/ci.yml) | [![Deploy](https://github.com/kmaooad/caja22-independent-team/actions/workflows/deploy.yml/badge.svg?d)](https://github.com/kmaooad/caja22-independent-team/actions/workflows/deploy.yml) | [![codecov](https://codecov.io/gh/kmaooad/caja22-independent-team/branch/master/graph/badge.svg?token=OG8zuwfoqA)](https://codecov.io/gh/kmaooad/caja22-independent-team) |
| bots | Experts | | [![CI](https://github.com/kmaooad/caja22-bots/actions/workflows/ci.yml/badge.svg)](https://github.com/kmaooad/caja22-bots/actions/workflows/ci.yml) | [![Deploy](https://github.com/kmaooad/caja22-bots/actions/workflows/deploy.yml/badge.svg)](https://github.com/kmaooad/caja22-bots/actions/workflows/deploy.yml) | [![codecov](https://codecov.io/gh/kmaooad/caja22-bots/branch/master/graph/badge.svg?token=7NFxMGizId)](https://codecov.io/gh/kmaooad/caja22-bots) |
| stalevary | Activities | | [![CI](https://github.com/kmaooad/caja22-stalevary/actions/workflows/ci.yml/badge.svg)](https://github.com/kmaooad/caja22-stalevary/actions/workflows/ci.yml) | [![Deploy](https://github.com/kmaooad/caja22-stalevary/actions/workflows/deploy.yml/badge.svg)](https://github.com/kmaooad/caja22-stalevary/actions/workflows/deploy.yml) | [![codecov](https://codecov.io/gh/kmaooad/caja22-stalevary/branch/master/graph/badge.svg?token=sMxk3bwaSm)](https://codecov.io/gh/kmaooad/caja22-stalevary)  |
| opossum | Students | | [![CI](https://github.com/kmaooad/caja22-opossum/actions/workflows/ci.yml/badge.svg)](https://github.com/kmaooad/caja22-opossum/actions/workflows/ci.yml) | [![Deploy](https://github.com/kmaooad/caja22-opossum/actions/workflows/deploy.yml/badge.svg)](https://github.com/kmaooad/caja22-opossum/actions/workflows/deploy.yml) | [![codecov](https://codecov.io/gh/kmaooad/caja22-opossum/branch/master/graph/badge.svg?token=FtJYpxnJNv)](https://codecov.io/gh/kmaooad/caja22-opossum) |
| kmavun | Search | &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ✅ | [![CI](https://github.com/kmaooad/caja22-kmavun/actions/workflows/ci.yml/badge.svg)](https://github.com/kmaooad/caja22-kmavun/actions/workflows/ci.yml) | [![Deploy](https://github.com/kmaooad/caja22-kmavun/actions/workflows/deploy.yml/badge.svg)](https://github.com/kmaooad/caja22-kmavun/actions/workflows/deploy.yml) | [![codecov](https://codecov.io/gh/kmaooad/caja22-kmavun/branch/master/graph/badge.svg?token=eBTB1SQDqh)](https://codecov.io/gh/kmaooad/caja22-kmavun) |
| manticore | Organizations | | [![CI](https://github.com/kmaooad/caja22-manticore/actions/workflows/ci.yml/badge.svg)](https://github.com/kmaooad/caja22-manticore/actions/workflows/ci.yml) | [![Deploy](https://github.com/kmaooad/caja22-manticore/actions/workflows/deploy.yml/badge.svg)](https://github.com/kmaooad/caja22-manticore/actions/workflows/deploy.yml) | &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;😢 |
| bot-farm | Jobs | &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ✅ | [![CI](https://github.com/kmaooad/caja22-bot-farm/actions/workflows/ci.yml/badge.svg)](https://github.com/kmaooad/caja22-bot-farm/actions/workflows/ci.yml) | [![Deploy](https://github.com/kmaooad/caja22-bot-farm/actions/workflows/deploy.yml/badge.svg)](https://github.com/kmaooad/caja22-bot-farm/actions/workflows/deploy.yml) | [![codecov](https://codecov.io/gh/kmaooad/caja22-bot-farm/branch/master/graph/badge.svg?token=JnKikm7fkM)](https://codecov.io/gh/kmaooad/caja22-bot-farm) |



## App Capabilities

Note: Unspecified data fields and/or relations can be chosen freely, but only when absolutely required. Unnecessary details that can be skipped – should be skipped.

* ACL
    * Check access
        * For incoming bot update message, check that requested command and resource are allowed for current user 
    * Set/update access rules
        * Create access rule. Rule is ‘allow’ or ‘deny’ from specific user OR department OR org to specific resource OR department OR org OR module
        * Update access rule
        * Delete access rule
    * Ban/unban an org/member
        * Ban specific user OR department OR organisation from access to the whole system
        * Remove ban
* Experts
    * Invite expert by email (education/industry/both)
        * For given email and expert type generate unique invitation URL and send invitation email 
        * Accept invitation, create expert
    * Manage experts
        * Create an expert in existing org
        * Update expert
        * Delete expert
    * Request to join
        * Submit a request to join platform providing info about you and your org (new or choosing existing one)
    * Approve a join request
        * Approve submitted join request, org is created, expert is created and added to org, email notification sent
        * Reject submitted join request, notify by email
    * Assign experts from existing members
        * Mark existing member an expert
        * Remove expert status from member 
* Students
    * Bulk import 
        * Mass create/update students from CSV, send email notifications
    * Manage group templates and groups 
        * Create/update/delete student group templates (e.g. “4th grade”)
        * Create/update/delete groups (e.g. “4th grade 2022”)
    * Assign activities (pending and completed)
        * Manually assign/unassign activity to group
        * Manually assign/unassign activity to student
    * Auto-update activities based on schedule (i.e. when activity start date passes, mark it as ‘in progress’ for the group, when activity end date passes, mark it as completed by the group)
* Activities
    * Bulk import courses/course projects
        * Mass create/update courses
    * Manage extracurricular activities
        * Create/update/delete any extra activities (e.g. projects, hackathons, challenges etc.)
    * Manage courses
        * Manually create/update/delete courses 
    * Assign competences to activities 
        * Manually set/unset relation between activity and competences
* Jobs
    * Manage jobs
        * Create/update/delete job
        * Activate/deactivate job (inactive job is visible, but cannot be applied for)
        * Relate jobs to competences
        * Relate jobs to activities
    * Manage CVs
        * Create/update/delete CV
        * Set job preferences (schedule, capacity, location, industries, competences, )
        * Hide/show CV
        * Set status (‘open for hires’)
        * Set preference ‘add competences automatically’
        * Manually add/remove competences 
        * If set as preference, automatically add competences to CV based on completed activities
    * Manage hiring status for org/dep
        * Set org/dept as ‘We are hiring’
        * Stop hiring and deactivate all jobs
    * Propose a job
        * TBD
    * Apply for a job
        * TBD
* Search & reports
	Note: This service requires its own data views and keeping them up-to-date with other services
    * Find students by competences
        * Query students filtered by own fields (e.g. group, org, dept) and competences
    * Get competences summary for student group
        * For given student group, return all competences gained by its students, aggregated by count
    * Find activities by competences
        * Query activities filtered by own fields (e.g. group, org, dept) and competences
    * Save search criteria and receive email updates when new matching items found
        * For any search query, save it for watching and notification on changes
* Competences
    * Manage knowledge areas (topics) 
        * Create/update/delete topics (name, parent topic)
    * Manage skills
        * Create/update/delete skills (name, parent skill)
    * Manage skill sets
        * Create/update/delete skill sets
        * Add/remove skills to/from sets
    * Manage projects   
        * Create/update/delete skill-based projects (title, description, topics, skills, skill sets)
* Organizations
    * Manage orgs
        * Create/update/delete org as admin (type: education/industry, name, website, description)
    * Self-signup
        * Submit org as org member
    * Activate/deactivate an org
        * Approve org submission and notify by email
        * Reject org submission with reason/suggestions
    * Manage departments
        * Create/update/delete depts (name, desc, parent)
    * Manage members
    * Assign/change a member’s role (admin/member)
    * Join an org with corp email
    * Request to join an org/dep
    * Approve a join request
    * Bulk import

