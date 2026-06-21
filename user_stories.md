# Smart Clinic Management System - User Stories

### 1. Doctor User Stories
* **Story:** As a Doctor, I want to view my daily schedule and appointment list so that I can manage my time and prepare for patients efficiently.
  * **Priority:** High
  * **Story Points:** 5
  * **Acceptance Criteria:** Must display patient name, appointment time, and contact detail.
* **Story:** As a Doctor, I want to update my available time slots dynamically so that patients only book slots when I am available.
  * **Priority:** Medium
  * **Story Points:** 3
  * **Acceptance Criteria:** Time slots can be selected and marked active/inactive instantly.
* **Story:** As a Doctor, I want to create and save digital prescriptions for patients during a consultation to maintain accurate digital health records.
  * **Priority:** High
  * **Story Points:** 8
  * **Acceptance Criteria:** System must save diagnosis text and medicines arrays, validated via authorization token.

### 2. Patient User Stories
* **Story:** As a Patient, I want to search for doctors by their name or medical specialty so that I can find the right healthcare provider for my needs.
  * **Priority:** High
  * **Story Points:** 3
  * **Acceptance Criteria:** Search bar must filter dynamically by name string or department specialty match.
* **Story:** As a Patient, I want to view available time slots for a specific doctor and book an appointment online easily.
  * **Priority:** High
  * **Story Points:** 5
  * **Acceptance Criteria:** Open slots must be distinct from booked blocks in real time.
* **Story:** As a Patient, I want to log into my personal portal to view all my past appointments and medical prescriptions securely.
  * **Priority:** Medium
  * **Story Points:** 5
  * **Acceptance Criteria:** Secured login verification via authenticated JWT sessions.

### 3. Admin User Stories (Minimum 5 Required)
* **Story 1:** As an Admin, I want to add new doctor profiles to the system database to keep the clinic records up to date.
  * **Priority:** High
  * **Story Points:** 5
  * **Acceptance Criteria:** Validate email format and check for duplicates before adding.
* **Story 2:** As an Admin, I want to remove or deactivate a doctor's account when they leave the clinic to prevent accidental bookings.
  * **Priority:** Medium
  * **Story Points:** 3
  * **Acceptance Criteria:** Soft-delete data record to retain appointment history safely.
* **Story 3:** As an Admin, I want to view a centralized logs dashboard to check user authentication and access violations.
  * **Priority:** Low
  * **Story Points:** 5
  * **Acceptance Criteria:** Real-time logging data containing active timestamps.
* **Story 4:** As an Admin, I want to update the profile details of an existing doctor so that room or shift modifications are correctly listed.
  * **Priority:** Medium
  * **Story Points:** 2
  * **Acceptance Criteria:** Reflect edits across patient portal immediately.
* **Story 5:** As an Admin, I want to generate systemic daily appointment statistical reports to evaluate resource distribution.
  * **Priority:** High
  * **Story Points:** 8
  * **Acceptance Criteria:** Provide tabular analytical logs containing daily aggregation.
