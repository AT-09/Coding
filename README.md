# Coding
Repository to push practice resolutions for Coding course

## First time setup
- Open command prompt, locate folder where project will be cloned
- Clone repository: git clone https://github.com/AT-09/Coding.git

## Steps to push changes
- Checkout to master branch: `git checkout master`
- Pull latest changes: `git pull`
- Checkout to a new branch: `git checkout -b <branch-name>`
- Add user folder with user's first name under kata's folder and add code resolution
- Once code resolution is completed, add changes: `git add .`
- Commit changes and add a brief summary of changes committed: `git commit`
- Push changes to remote repository `git push -u origin <branch-name>`
- Go to GitHub and open a new Pull Request from `<branch-name>` to master